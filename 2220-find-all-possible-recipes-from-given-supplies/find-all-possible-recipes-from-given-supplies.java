class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> availableSupplies = new HashSet<>(Arrays.asList(supplies));
        Map<String, List<String>> recipeToIngredients = new HashMap<>();
        Set<String> result = new HashSet<>();
        
        for (int i = 0; i < recipes.length; i++) {
            recipeToIngredients.put(recipes[i], ingredients.get(i));
        }
        
        Queue<String> queue = new LinkedList<>(Arrays.asList(supplies));
        Set<String> preparedRecipes = new HashSet<>(availableSupplies); 
        
        while (!queue.isEmpty()) {
            String currentSupply = queue.poll();
            
            for (String recipe : recipeToIngredients.keySet()) {
                if (preparedRecipes.contains(recipe)) continue;
                
                List<String> recipeIngredients = recipeToIngredients.get(recipe);
                boolean canMakeRecipe = true;
                
                for (String ingredient : recipeIngredients) {
                    if (!availableSupplies.contains(ingredient)) {
                        canMakeRecipe = false;
                        break;
                    }
                }
                
                if (canMakeRecipe) {
                    preparedRecipes.add(recipe);
                    availableSupplies.add(recipe);
                    queue.add(recipe);
                    result.add(recipe);
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}
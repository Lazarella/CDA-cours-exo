export class mockupRecipe{
    constructor(
        private id: string, 
        private name: string, 
        private servings: number, 
        private prepTime: number,
        private cookTime: number, 
        private ingredients: {
            name: string; 
            amount: string; 
        } [], 
        private instructions: string[] ){
        }
}
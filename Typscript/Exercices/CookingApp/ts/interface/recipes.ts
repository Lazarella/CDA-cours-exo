export interface Recipe{
id?: string; 
name: string; 
servings: number; 
prepTime: number; 
cookTime: number; 
ingredients: {
    name: string; 
    amount: string; 
} []; 
instructions: string[];  
}
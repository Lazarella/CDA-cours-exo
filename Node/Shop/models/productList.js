export class productList{
    constructor(){
        this.products = []; 
    }
    addProduct(newProduct) {
    this.products.push(newProduct);
    }

    removeProduct(productId) {
    this.products = this.products.filter(product => product.id !== productId);
    }

    getAllProducts() {
    return this.products;
    }
}

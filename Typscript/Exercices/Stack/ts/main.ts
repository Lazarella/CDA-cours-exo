import { Stack } from "./classes/Stack.js";

const stack = new Stack<string>([]);

stack.addItem("hello", "world"); 

const stack2 = new Stack<number>([]);

stack2.addItem(42,35, 17.5);

stack2.removeItem(35);
stack2.removeItem(36);
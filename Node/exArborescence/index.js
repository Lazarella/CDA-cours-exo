import { mkdir, writeFile, readFile } from "fs/promises";
import path from "path";

const myFilePath = "./data.txt";
const content = "Rainbow, All, Day, Long ";

// const dataFilePath = "./data.txt";

(async () => {
    try {
        //writing content to the data.txt file
        await writeFile(myFilePath, content);
        console.log("File written successfully!");
        // Read the data from the file
        const dataBuffer = await readFile(myFilePath);
        const dataContent = dataBuffer.toString();

      // Split the content into an array of directory names (assuming each line is a directory name)
        const directoryNames = dataContent.split(",");

      // Create directories based on the names
        for (const name of directoryNames) {
        const directoryPath = path.join(__dirname, name); // Create the full path for the directory
        await mkdir(directoryPath, { recursive: true });
        console.log(`Directory "${name}" created successfully.`);
        }
    } catch (error) {
        console.error("Error:", error);
    }
})();  
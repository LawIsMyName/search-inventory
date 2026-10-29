# Search Inventory 
## Project Description:
Search Inventory is a Java application that allows users to view and search through a list of products. The project demonstrates basic Java programming concepts such as classes, objects, methods, lists, and file handling.
### Features: 
- Display all available products in the inventory.
- Store product information, including ID, name, and price.
- Read product information from a CSV file.
- Add new products to the inventory by updating the CSV file.
### Technologies used:
- Java
- IntelliJ IDEA
- Git & GitHub
- CSV Files 
### Project Structure:

```text
search-inventory/
│
├── src/
│   ├── App.java
│   └── Product.java
│
├── inventory.csv
└── README.md
```
### Interesting Code: 
```java
FileReader fileReader = new FileReader("inventory.csv");
BufferedReader bufferedReader = new BufferedReader(fileReader);

String line = bufferedReader.readLine();

while (line != null) {
String[] parts = line.split("\\|");

    int id = Integer.parseInt(parts[0]);
    String name = parts[1];
    double price = Double.parseDouble(parts[2]);

    Product product = new Product(id, name, price);

    System.out.println(product);

    line = bufferedReader.readLine();
}

bufferedReader.close();
fileReader.close();
```
### Screenshot:
![The Inventory](/images/inventory.png) 






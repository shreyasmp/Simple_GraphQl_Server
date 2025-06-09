# Simple_GraphQl_Server

Once you run the application, 

hit up: http://localhost:8080/graphiql?path=/graphql

Then paste the below graphQL query in the browser to see the response.

````
query bookDetails {
  bookById(id: "book-1") {
    id
    name
    pageCount
    author {
      id
      firstName
      lastName
    }
  }
}

````

Response looks something like below:

````$xslt
{
  "data": {
    "bookById": {
      "id": "book-1",
      "name": "Effective-Java",
      "pageCount": 416,
      "author": {
        "id": "author-1",
        "firstName": "Joshua",
        "lastName": "Bloch"
      }
    }
  }
}
````

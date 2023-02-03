
# Microservice Transaction
### Endpoints:
#### Save Transaction
```
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 42

{
    "userId":1,
    "productId":1
}
```
#### Get Transactions By User
```
GET /api/transaction/{userId} HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
```
#### Delete Transaction
```
DELETE /api/transaction/{transactionId} HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
```

## Adapter Pattern
> The Adapter pattern is commonly used to encapsulate differences between external dependencies 
  that provide similar functionality, and expose a unified interface to the client.

### Example
We are building a data persistence service to save data into various cloud storage services: AWS S3
, Azure blob storage and google cloud storage. Since the APIs are not unified, for the user who
wants to call this API, he needs to be aware of the difference.

This is where Adapter pattern comes into play.
You can just use an adapter class, which abstract the gap way and exposes an unified API:

### classes
- interface expose to client;  // should have interfaces required by client
- Adaptor must implement interface, and contains an incompatible class.     
Adaptor will use the class to implement interface method.
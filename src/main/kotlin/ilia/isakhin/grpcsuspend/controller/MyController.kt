package ilia.isakhin.grpcsuspend.controller

import ilia.isakhin.grpcsuspend.service.HelloReply
import ilia.isakhin.grpcsuspend.service.HelloRequest
import ilia.isakhin.grpcsuspend.service.MyServiceGrpcKt
import kotlinx.coroutines.delay
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class MyController : MyServiceGrpcKt.MyServiceCoroutineImplBase() {

    override suspend fun sayHello(request: HelloRequest): HelloReply {
        delay(1)
        
        return HelloReply.newBuilder()
            .setMessage("Hello ==> ${request.name}")
            .build()
    }
}

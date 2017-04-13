package app.config

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 *
 * @author nsoushi
 */
@ConfigurationProperties("app")
class AppProperties {

    var grpc = Grpc()

    class Grpc {

        var server = Server()

        class Server {
            var hostname: String? = null
            var port: Int? = null
        }
    }
}

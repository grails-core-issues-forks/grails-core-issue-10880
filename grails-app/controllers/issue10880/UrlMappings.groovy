package issue10880

class UrlMappings {

    static mappings = {

        name mymapping: "/testurl" (view:'/myview')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

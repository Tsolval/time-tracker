yieldUnescaped '<!DOCTYPE html>'
html {
   head {
      title(pageTitle)
      link(rel: 'stylesheet', href: '/css/bootstrap.min.css')
   }
   body {
      div(class: 'container') {
         div(class: 'navbar') {
            div(class: 'navbar-inner') {
               a(class: 'brand', href: 'http://groovy-lang.org/templating.html#_the_markuptemplateengine', 'Groovy Template Engine Documentation')
			   br()
               a(class: 'brand', href: 'http://projects.spring.io/spring-boot/') {
                  yield 'Spring Boot Documentation'
               }
            }
         }
         mainBody()
      }
   }
}
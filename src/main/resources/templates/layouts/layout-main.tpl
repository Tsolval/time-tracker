yieldUnescaped '<!DOCTYPE html>'
html {
   head {
      title(pageTitle)
	  meta(name: 'viewport', content: 'width=device-width, initial-scale=1')
      link(rel: 'stylesheet', href: '/css/main.css')
      link(rel: 'stylesheet', href: 'http://www.w3schools.com/lib/w3.css')
   }
   body {
      div(class: 'w3-container') {
         ul(class: 'w3-navbar w3-black') {
            li(class: 'navbar-inner') {
               a(class: 'brand', href: 'http://groovy-lang.org/templating.html#_the_markuptemplateengine', 'Groovy Template Engine Documentation')
            }
			li(class:'navbar-inner') {
               a(class: 'brand', href: 'http://projects.spring.io/spring-boot/') {
                  yield 'Spring Boot Documentation'
               }
            }
         }
         mainBody()
      }
   }
}
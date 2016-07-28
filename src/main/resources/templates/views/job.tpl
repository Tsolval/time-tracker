layout 'layouts/layout-main.tpl',
pageTitle: 'Spring Boot - Groovy templates example with layout',
mainBody: contents {
   div(class:"text"){
	  p("This is an application using Spring Boot $bootVersion and Groovy Templates $groovyVersion")
	  table(class:"jobTable"){
		 jobs.each{ job ->
		  tr(class:"jobTableRow"){
			td(class: "jobTableType", "$job.type.id")
			td(class: "jobTableDesc", "$job.description")
			td(class: "jobTableTime", "$job.estimatedTime") 
			td(class: "jobTableUnit", "$job.estimatedUnits") 
			td(class: "jobTableTime", "$job.actualTime") 
			td(class: "jobTableUnit", "$job.actualUnits") 
			td(class: "jobTableRate", "$job.actualRate") 
			td(class: "jobTableFini", "$job.isComplete") 
		 }}
	  }
   }
}
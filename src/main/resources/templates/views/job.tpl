layout 'layouts/layout-main.tpl',
pageTitle: 'Spring Boot - Groovy templates example with layout',
mainBody: contents {
   div(class:"text"){
	  p("This is an application using Spring Boot $bootVersion and Groovy Templates $groovyVersion")
	  table(class:"w3-table-all w3-card-2"){
		  thead(){
			  tr(class: "w3-blue"){
				  th( "Type")
				  th( "Description")
				  th( "Est. Time")
				  th( "Est. Units")
				  th( "Act. Time")
				  th( "Act. Units")
				  th( "Act. Rate")
				  th( "Complete")
			  }
		  }
		 jobs.each{ job ->
		  tr(){
			td( "$job.type.id")
			td( "$job.description")
			td( "$job.estimatedTime") 
			td( "$job.estimatedUnits") 
			td( "$job.actualTime") 
			td( "$job.actualUnits") 
			td( "$job.actualRate") 
			td( "$job.isComplete") 
		 }}
	  }
   }
}
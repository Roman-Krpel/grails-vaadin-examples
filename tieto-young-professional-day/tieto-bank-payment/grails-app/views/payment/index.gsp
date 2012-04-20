<g:each var="payment" in="${payments}">
	<li>
		${payment.date} : <g:link action="remove" id="${payment.id}">Remove</g:link>
	</li>
	
</g:each>
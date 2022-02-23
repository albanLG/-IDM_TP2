package org.xtext.example.jppjson.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.jppjson.myDsl.Programme

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class ScalaCompilerTest {
	@Inject
	ParseHelper<Programme> parseHelper
	
	@Test
	def void loadModel() {
		
		val result = parseHelper.parse(''' 
		Load("testvide.json"){
			RemoveElement("Hello");
		}
		''')
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
		
		val ScalaCompilerXtend cmpJava = new ScalaCompilerXtend(result)
		
		cmpJava.run()
		
	}
}
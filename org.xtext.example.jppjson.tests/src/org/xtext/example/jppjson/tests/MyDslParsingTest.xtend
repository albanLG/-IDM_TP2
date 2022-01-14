/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.jppjson.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.jppjson.myDsl.Expression

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<Expression> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse(''' "Hello" ''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val JacksonCompiler cmpJava = new JacksonCompiler(result)
		cmpJava.compileAndRun
	}
}

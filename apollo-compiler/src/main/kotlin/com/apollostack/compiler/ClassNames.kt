package com.apollostack.compiler

import com.apollostack.api.graphql.*
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.ParameterizedTypeName
import com.squareup.javapoet.TypeName
import com.squareup.javapoet.WildcardTypeName
import java.io.IOException

object ClassNames {
  val STRING: ClassName = ClassName.get(String::class.java)
  val LIST: ClassName = ClassName.get(List::class.java)
  @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
  val GRAPHQL_OPERATION: ClassName = ClassName.get(Operation::class.java)
  val GRAPHQL_QUERY: ClassName = ClassName.get(Query::class.java)
  val GRAPHQL_MUTATION: ClassName = ClassName.get(Mutation::class.java)
  val GRAPHQL_OPERATION_VARIABLES: TypeName = ClassName.get("", "${GRAPHQL_OPERATION.simpleName()}.Variables")
  val ILLEGAL_STATE_EXCEPTION: TypeName = ClassName.get(IllegalStateException::class.java)
  val API_RESPONSE_READER: ClassName = ClassName.get(ResponseReader::class.java)

  fun parameterizedListOf(typeArgument: TypeName): TypeName =
      ParameterizedTypeName.get(LIST, WildcardTypeName.subtypeOf(typeArgument.withoutAnnotations()))
}
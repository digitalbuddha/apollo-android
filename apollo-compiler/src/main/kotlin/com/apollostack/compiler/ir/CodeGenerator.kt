package com.apollostack.compiler.ir

import com.squareup.javapoet.TypeSpec

interface CodeGenerator {
  fun toTypeSpec(abstractClass: Boolean, reservedTypeNames: List<String>, typeDeclarations: List<TypeDeclaration>,
      fragmentsPackage: String = "", typesPackage: String = ""): TypeSpec
}

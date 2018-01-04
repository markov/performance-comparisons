package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_216 {
    private val production = Production9_216("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
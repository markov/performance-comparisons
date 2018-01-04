package org.gradle.test.performance4_3

import org.junit.Assert.*

class Test4_267 {
    private val production = Production4_267("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
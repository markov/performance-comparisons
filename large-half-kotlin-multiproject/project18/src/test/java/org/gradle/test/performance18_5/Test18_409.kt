package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_409 {
    private val production = Production18_409("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
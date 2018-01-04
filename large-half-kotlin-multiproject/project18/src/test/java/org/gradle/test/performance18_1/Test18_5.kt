package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_5 {
    private val production = Production18_5("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
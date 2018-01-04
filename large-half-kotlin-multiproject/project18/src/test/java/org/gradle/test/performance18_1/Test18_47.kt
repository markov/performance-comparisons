package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_47 {
    private val production = Production18_47("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
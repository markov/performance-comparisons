package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_67 {
    private val production = Production18_67("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
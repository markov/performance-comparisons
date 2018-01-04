package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_486 {
    private val production = Production18_486("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
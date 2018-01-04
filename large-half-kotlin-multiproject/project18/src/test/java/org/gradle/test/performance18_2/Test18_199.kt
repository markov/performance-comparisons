package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_199 {
    private val production = Production18_199("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
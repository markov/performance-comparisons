package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_140 {
    private val production = Production18_140("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
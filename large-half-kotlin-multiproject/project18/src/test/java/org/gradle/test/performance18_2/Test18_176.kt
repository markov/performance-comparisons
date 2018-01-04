package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_176 {
    private val production = Production18_176("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_138 {
    private val production = Production18_138("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
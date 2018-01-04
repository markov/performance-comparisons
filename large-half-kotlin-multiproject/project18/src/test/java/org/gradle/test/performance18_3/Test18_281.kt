package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_281 {
    private val production = Production18_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
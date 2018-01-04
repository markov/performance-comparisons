package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_228 {
    private val production = Production18_228("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
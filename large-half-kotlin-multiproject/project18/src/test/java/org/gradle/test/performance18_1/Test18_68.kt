package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_68 {
    private val production = Production18_68("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
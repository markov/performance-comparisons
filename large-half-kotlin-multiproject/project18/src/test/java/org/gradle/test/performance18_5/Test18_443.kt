package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_443 {
    private val production = Production18_443("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_329 {
    private val production = Production18_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
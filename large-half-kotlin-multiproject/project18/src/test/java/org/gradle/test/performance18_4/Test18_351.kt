package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_351 {
    private val production = Production18_351("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
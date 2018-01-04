package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_297 {
    private val production = Production18_297("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
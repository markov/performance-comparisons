package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_33 {
    private val production = Production18_33("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance36_2

import org.junit.Assert.*

class Test36_160 {
    private val production = Production36_160("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
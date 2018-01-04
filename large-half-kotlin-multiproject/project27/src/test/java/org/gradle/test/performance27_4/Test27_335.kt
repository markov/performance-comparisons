package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_335 {
    private val production = Production27_335("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_413 {
    private val production = Production27_413("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
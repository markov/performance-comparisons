package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_371 {
    private val production = Production27_371("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
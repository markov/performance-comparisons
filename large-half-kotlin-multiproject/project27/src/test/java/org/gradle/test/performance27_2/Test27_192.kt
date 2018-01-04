package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_192 {
    private val production = Production27_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
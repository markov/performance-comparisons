package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_227 {
    private val production = Production27_227("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance24_1

import org.junit.Assert.*

class Test24_51 {
    private val production = Production24_51("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
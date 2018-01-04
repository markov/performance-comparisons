package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_281 {
    private val production = Production38_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
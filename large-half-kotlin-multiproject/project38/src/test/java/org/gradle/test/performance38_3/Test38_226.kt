package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_226 {
    private val production = Production38_226("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
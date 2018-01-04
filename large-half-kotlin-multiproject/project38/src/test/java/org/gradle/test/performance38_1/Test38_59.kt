package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_59 {
    private val production = Production38_59("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_495 {
    private val production = Production27_495("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_495 {
    private val production = Production36_495("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
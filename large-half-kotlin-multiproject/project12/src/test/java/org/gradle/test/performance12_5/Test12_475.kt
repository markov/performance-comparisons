package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_475 {
    private val production = Production12_475("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}